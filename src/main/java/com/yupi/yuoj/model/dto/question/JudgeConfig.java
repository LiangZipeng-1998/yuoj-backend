package com.yupi.yuoj.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 *
 * @Author : liang.zi.peng
 * @create 2023/8/12 9:17
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（KB）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（KB）
     */
    private Long stackLimit;

}
