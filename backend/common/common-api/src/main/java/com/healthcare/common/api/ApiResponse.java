package com.healthcare.common.api;

public record ApiResponse<T>(T data, String traceId) {
}
