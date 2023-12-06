package pub.developers.forum.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Qiangqiang.Bian
 * @create 2020/10/31
 * @desc
 **/
@Getter
@AllArgsConstructor
public enum PostsCategoryEn {
    ARTICLE("ARTICLE", "帖子"),
    FAQ("FAQ", "问答"),
    ;
    private String value;
    private String desc;
}
