package ubtms.module.game.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ubtms.module.game.entity.Game;
import ubtms.module.game.entity.GameExample;

public interface GameMapper {
    Game selectLastData();
    int countByExample(GameExample example);

    int deleteByExample(GameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Game record);

    int insertSelective(Game record);

    List<Game> selectByExample(GameExample example);

    Game selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Game record, @Param("example") GameExample example);

    int updateByExample(@Param("record") Game record, @Param("example") GameExample example);

    int updateByPrimaryKeySelective(Game record);

    int updateByPrimaryKey(Game record);
}