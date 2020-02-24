package com.hb.design.princple;

import com.hb.design.principle.demeter.Boss;
import com.hb.design.principle.demeter.TeamLeader;
import org.junit.Test;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  13:16  2020/1/7.
 */
public class demeter {
    @Test
    public void getCourseNumber(){
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckCourse(teamLeader);
    }
}
