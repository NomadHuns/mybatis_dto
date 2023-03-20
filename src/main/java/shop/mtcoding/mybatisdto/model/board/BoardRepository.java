package shop.mtcoding.mybatisdto.model.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.mybatisdto.dto.BoardDetailOutDto;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto2;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public BoardDetailOutDto findByIdJoinUser(Integer id);

    public BoardJoinUserDto findByIdJoinUser2(Integer id);

    public BoardJoinUserDto2 findByIdJoinUser3(Integer id);
}
