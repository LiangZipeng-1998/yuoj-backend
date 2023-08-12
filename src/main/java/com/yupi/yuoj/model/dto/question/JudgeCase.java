package com.yupi.yuoj.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 *
 * @Author : liang.zi.peng
 * @create 2023/8/12 9:17
 */
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;

}
