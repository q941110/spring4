package chanhee.setting.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import chanhee.setting.domain.Member;
import chanhee.setting.sql.MemberSqls;

@Repository
public class MemberDao {
	private NamedParameterJdbcTemplate jdbc; 
    private RowMapper<Member> rowMapper = BeanPropertyRowMapper.newInstance(Member.class); 
    
    public MemberDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource); 
    }

    public List<Member> selectAll(){
    	return jdbc.query(MemberSqls.SELECT_ALL, rowMapper);
    }
}
