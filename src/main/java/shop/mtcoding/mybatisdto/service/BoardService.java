package shop.mtcoding.mybatisdto.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatisdto.dto.BoardDetailOutDto;
import shop.mtcoding.mybatisdto.dto.BoardDetailOutDto2;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto2;
import shop.mtcoding.mybatisdto.model.board.BoardRepository;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardDetailOutDto2 getBoardDetail(Integer id) {
        BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        System.out.println("테스트 : " + boardDetailOutDto);
        BoardDetailOutDto2 boardDetailOutDto2 = new BoardDetailOutDto2(boardDetailOutDto);
        System.out.println("테스트 : " + boardDetailOutDto2);
        return boardDetailOutDto2;
    }

    public BoardJoinUserDto getBoardDetail2(Integer id) {
        BoardJoinUserDto boardJoinUserDto = boardRepository.findByIdJoinUser2(id);
        System.out.println("테스트 : " + boardJoinUserDto);
        return boardJoinUserDto;
    }

    public BoardJoinUserDto2 getBoardDetail3(Integer id) {
        BoardJoinUserDto2 boardJoinUserDto2 = boardRepository.findByIdJoinUser3(id);
        System.out.println("테스트 : " + boardJoinUserDto2);
        return boardJoinUserDto2;
    }

}
