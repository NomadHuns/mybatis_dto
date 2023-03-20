package shop.mtcoding.mybatisdto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatisdto.service.BoardService;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        return ResponseEntity.ok().body(boardService.getBoardDetail(id));
    }

    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detail2(@PathVariable Integer id) {
        return ResponseEntity.ok().body(boardService.getBoardDetail2(id));
    }

    @GetMapping("/board/v3/{id}")
    public ResponseEntity<?> detail3(@PathVariable Integer id) {
        return ResponseEntity.ok().body(boardService.getBoardDetail3(id));
    }
}
