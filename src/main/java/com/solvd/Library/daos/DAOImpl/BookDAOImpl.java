package com.solvd.Library.daos.DAOImpl;

import com.solvd.Library.daos.BookDAO;
import com.solvd.Library.entitie.Book;
import com.solvd.Library.exception.DAOException;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl extends AbstractJDBCDao implements BookDAO {
    private final static String INSERT = "INSERT INTO book(idBook, genre, tittle, author) VALUES(?, ?, ?, ?)";
    private final static String UPDATE = "UPDATE book SET genre = ?, tittle = ?, author = ? WHERE idBook = ?";
    private final static String DELETE = "DELETE FROM book WHERE idBook = ?";
    private final static String GET_ALL = "SELECT idBook, genre, tittle, author FROM book";
    private final static String GET_ONE = "SELECT idBook, genre, tittle, author FROM book WHERE idBook = ?";
    private final static String GROUP_BY_GENRE = "SELECT * FROM book WHERE genre=?";
    private final static String GROUP_BY_AUTHOR = "SELECT * FROM book WHERE author=?";

    @Override
    public void insert(Book a) throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1, a.getIdBook());
            stat.setString(2, a.getGenre());
            stat.setString(3, a.getTittle());
            stat.setString(4, a.getAuthor());

            if (stat.executeUpdate() == 0) {
                throw new DAOException("May not have been saved");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    @Override
    public void deleteById(int id) throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, id);


            if (stat.executeUpdate() == 0) {
                throw new DAOException("May not have been saved");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    @Override
    public void update(Book a) throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        try {
            stat = conn.prepareStatement(UPDATE);

            stat.setString(1, a.getGenre());
            stat.setString(2, a.getTittle());
            stat.setString(3, a.getAuthor());
            stat.setInt(4, a.getIdBook());

            if (stat.executeUpdate() == 0) {
                throw new DAOException("May not have been saved");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    private Book convert(ResultSet rs) throws SQLException {
        String idBook = rs.getString("idBook");
        String genre = rs.getString("genre");
        String author  = rs.getString("author");
        Book books = new Book();
        books.setIdBook(rs.getInt("idCar"));
        return books;
    }

    @Override
    public List<Book> getAll() throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        List<Book> books = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GET_ALL);
            rs = stat.executeQuery();
            while (rs.next()) {
                books.add(convert(rs));
            }
        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }

        }
        return books;
    }

    @Override
    public Book getById(int id) throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        Book a;
        try {
            stat = conn.prepareStatement(GET_ONE);
            stat.setInt(1, id);
            rs = stat.executeQuery();

            if (rs.next()) {
                a = convert(rs);
            } else {
                throw new DAOException("The register doesn´t found.");
            }
        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }

        }
        return a;
    }
    public List<Book>  groupByGenre() throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        List<Book> books = new ArrayList<>();
        Book a = null;
        try {

            stat = conn.prepareStatement(GROUP_BY_GENRE);
            stat.setString(1, a.getGenre());
            rs = stat.executeQuery();

            while (rs.next()) {
                books.add(convert(rs));
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }

        }
        return books;
    }
    public List<Book>  groupByAuthor() throws DAOException, ConnectException {
        PreparedStatement stat = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        List<Book> books = new ArrayList<>();
        Book a = null;
        try {

            stat = conn.prepareStatement(GROUP_BY_AUTHOR);
            stat.setString(1, a.getAuthor());
            rs = stat.executeQuery();

            while (rs.next()) {
                books.add(convert(rs));
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }

        }
        return books;
    }



}
