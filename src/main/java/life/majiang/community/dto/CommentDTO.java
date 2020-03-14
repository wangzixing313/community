package life.majiang.community.dto;

import lombok.Data;

/**
 * Created by lenovo on 2020/3/14 18:55
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
