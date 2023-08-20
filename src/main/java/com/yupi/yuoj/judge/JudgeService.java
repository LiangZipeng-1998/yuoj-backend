package com.yupi.yuoj.judge;

import com.yupi.yuoj.model.entity.QuestionSubmit;

/**
 * 判题服务
 *
 * @Author : liang.zi.peng
 * @create 2023/8/20 18:34
 */
public interface JudgeService {

    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);

}
