package com.myproj.ublcii.api;

import com.myproj.ublcii.service.UBLCIIConversionService;

import io.swagger.annotations.Api;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import org.springframework.core.io.Resource;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = { "UBLCII API" })
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-21T13:41:33.184Z[GMT]")
@RestController
public class UBLCIIApiController implements UBLCIIApi {

	private final UBLCIIConversionService ublciiConversionService;

	public UBLCIIApiController(UBLCIIConversionService ublciiConversionService) {
		this.ublciiConversionService = ublciiConversionService;
	}

	public Mono<ResponseEntity<Resource>> postUBLCII(@RequestPart("uploadFile") MultipartFile file) {

		return Mono.<Resource>fromCallable(() -> this.ublciiConversionService.convertInvoiceFormat(file))
				.subscribeOn(Schedulers.boundedElastic()).<ResponseEntity<Resource>>flatMap(resource -> {
					HttpHeaders headers = new HttpHeaders();
					headers.setContentDispositionFormData(file.getName(), file.getName());
					return Mono.just(
							ResponseEntity.ok().cacheControl(CacheControl.noCache()).headers(headers).body(resource));
				});

	}

}
