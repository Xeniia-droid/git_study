package com.Feature.WSFeature;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="Cannot find user by id")
public class NotFoundException extends RuntimeException {}
