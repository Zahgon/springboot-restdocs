package com.rest.docs.springbootrestdocs.member;

import com.rest.docs.springbootrestdocs.common.PageResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
@AllArgsConstructor
public class MemberApi {

    private final MemberRepository memberRepository;

    @GetMapping("/{id}")
    public MemberResponse getMember(@PathVariable Long id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PutMapping("/{id}")
    public void modifyMember(@PathVariable final Long id, @RequestBody @Valid final MemberModificationRequest dto) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @GetMapping
    public PageResponse<MemberResponse> getMembers(@PageableDefault(sort = "id", direction = Direction.DESC) Pageable pageable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PostMapping
    public void registerMember(@RequestBody @Valid MemberRegistrationRequest dto) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @ApiOperation(value = "members 조회", response = Member.class, responseContainer = "List")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "응답 성공"), @ApiResponse(code = 400, message = "유효하지 하지 않은 입력") })
    @GetMapping("/swagger")
    public List<Member> getMember2(@ApiParam(name = "page", value = "page", defaultValue = "0") @RequestParam Integer page, @ApiParam(name = "size", value = "size", defaultValue = "10") @RequestParam Integer size) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
