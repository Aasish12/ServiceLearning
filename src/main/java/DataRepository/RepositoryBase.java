package DataRepository;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

// Package private
class RepositoryBase {
    ConnectionSource db;

    RepositoryBase() throws SQLException {
        db = new JdbcConnectionSource("jdbc:mysql://localhost:3306/test?user=root&password=boj75302816");
    }
}