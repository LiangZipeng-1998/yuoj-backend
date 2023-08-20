package com.yupi.yuoj.judge.strategy;

import com.yupi.yuoj.model.dto.questionsubmit.JudgeInfo;

/**
 * 判题策略
 *
 * @Author : liang.zi.peng
 * @create 2023/8/20 19:32
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);

}
