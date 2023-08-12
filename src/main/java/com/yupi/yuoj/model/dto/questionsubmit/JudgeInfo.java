package com.yupi.yuoj.model.dto.questionsubmit;

import lombok.Data;

/**
 * 判题信息
 *
 * @Author : liang.zi.peng
 * @create 2023/8/12 9:17
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（ms）
     */
    private Long time;

}
