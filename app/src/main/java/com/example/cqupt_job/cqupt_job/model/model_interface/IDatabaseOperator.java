package com.example.cqupt_job.cqupt_job.model.model_interface;

import com.example.cqupt_job.cqupt_job.bean.Student;
import com.example.cqupt_job.cqupt_job.bean.User;

/**
 * Created by android_chen on 2016/4/12.
 */
public interface IDatabaseOperator {
     Student login(User user);
}
