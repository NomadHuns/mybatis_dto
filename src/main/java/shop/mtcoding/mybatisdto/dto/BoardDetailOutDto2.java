package shop.mtcoding.mybatisdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDetailOutDto2 {
    private Integer id;
    private String title;
    private String content;
    private UserDto user;
    private Timestamp createdAt;

    public BoardDetailOutDto2(BoardDetailOutDto board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getTitle();
        this.user = new UserDto(board);
        this.createdAt = board.getCreatedAt();
    }

    @Getter
    @Setter
    @ToString
    public class UserDto {
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;

        public UserDto(BoardDetailOutDto board) {
            this.id = board.getUserId();
            this.username = board.getUserUsername();
            this.password = board.getUserPassword();
            this.email = board.getUserEmail();
            this.createdAt = board.getUserCreatedAt();
        }
    }
}
