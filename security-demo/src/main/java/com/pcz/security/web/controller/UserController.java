package com.pcz.security.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.pcz.security.dto.User;
import com.pcz.security.dto.UserQueryCondition;
import com.pcz.security.exception.UserNotExistsException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author picongzhi
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @JsonView(User.UserSimpleView.class)
    @GetMapping()
    @ApiOperation(value = "用户查询服务")
    public List<User> query(UserQueryCondition condition,
                            @PageableDefault(page = 1, size = 20, sort = "username, asc") Pageable pageable) {
        List<User> userList = new ArrayList<>();
        userList.add(new User());
        userList.add(new User());
        userList.add(new User());

        return userList;
    }

    @JsonView(User.UserDetailView.class)
    @GetMapping(value = "/{id:\\d+}")
    public User getInfo(@ApiParam(value = "用户id", required = true) @PathVariable() String id) {
        User user = new User();
        user.setUsername("pcz");
        user.setPassword("123456");

        return user;

//        throw new UserNotExistsException(id);
    }

    @PostMapping
    public User create(@Valid @RequestBody User user) {
        user.setId("1");

        return user;
    }

    @PutMapping("/{id:\\d}")
    public User update(@PathVariable String id,
                       @Valid @RequestBody User user,
                       BindingResult errors) {
        return user;
    }

    @DeleteMapping("/{id:\\d}")
    public void delete(@PathVariable String id) {
    }

//    @GetMapping("/me")
//    public Object getCurrentUser(Authentication authentication) {
////        return SecurityContextHolder.getContext().getAuthentication();
//        return authentication;
//    }

    @GetMapping("/me")
    public Object getCurrentUser(@AuthenticationPrincipal UserDetails userDetails) {
        return userDetails;
    }
}
