package com.rest.docs.springbootrestdocs;

import com.rest.docs.springbootrestdocs.member.Member;
import com.rest.docs.springbootrestdocs.member.MemberRepository;
import com.rest.docs.springbootrestdocs.order.Order;
import com.rest.docs.springbootrestdocs.order.OrderRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataSetUp implements ApplicationRunner {

    private final MemberRepository memberRepository;

    private final OrderRepository orderRepository;

    @Override
    public void run(ApplicationArguments args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
