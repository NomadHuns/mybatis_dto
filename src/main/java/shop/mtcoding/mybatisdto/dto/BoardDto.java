package shop.mtcoding.mybatisdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDto {
    private Integer id;
    private String title;
    private String content;
    // private UserDto user;
    private Timestamp createdAt;
}
