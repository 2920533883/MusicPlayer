package DataBase;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class DataBaseTest {
    @Test
    public void test1() throws IOException {
        String resource = "Mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            MusicMapper mapper = sqlSession.getMapper(MusicMapper.class);
            mapper.insertMusic(new Music("告白气球", "周杰伦"));
            List<Music> music = mapper.getMusic();
            sqlSession.commit();
            System.out.println(music);
        }
    }
}