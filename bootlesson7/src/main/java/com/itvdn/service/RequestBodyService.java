package com.itvdn.service;

import com.itvdn.dto.RequestBodyDto;
import com.itvdn.dto.RequestBodyResponse;
import org.springframework.stereotype.Service;

@Service
public class RequestBodyService {
    public RequestBodyResponse doSomething(RequestBodyDto requestBodyDto) {
        return new RequestBodyResponse(requestBodyDto.getName() + requestBodyDto.getId());
    }
}
