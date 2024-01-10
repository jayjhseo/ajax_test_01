package com.ajax.ajax.vote;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/vote")
public class VoteController {
    private final VoteService voteService;
    private int voteCount = 0;
    @GetMapping("/menu")
    public String vote() {
        return "vote_menu";
    }
    @GetMapping("/doVote")
    @ResponseBody
    public String doVote() {
        voteCount++;
        return "추천수 " + voteCount;
    }
}
