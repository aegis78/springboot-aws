package com.juju.aws.springboot.web;

import com.juju.aws.springboot.web.dto.PostsSaveRequestDto;
import com.juju.aws.springboot.web.service.PostsSrvice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsSrvice postsSrvice;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto postsSaveRequestDto) {
        return postsSrvice.save(postsSaveRequestDto);
    }


}
