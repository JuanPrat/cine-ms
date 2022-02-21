package adapters;

import com.poli.moviesservice.adapter.MoviesAdapter;
import com.poli.moviesservice.entity.Movie;
import com.poli.moviesservice.repository.MoviesRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class MoviesAdapterTest {

    @Mock
    MoviesRepository moviesRepositoryMock;

    @InjectMocks
    MoviesAdapter moviesAdapterUnderTest;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        moviesAdapterUnderTest = new MoviesAdapter(moviesRepositoryMock);
    }

    @Test
    public void getAllMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie1 = Movie.builder().build();
        Movie movie2 = Movie.builder().build();
        Movie movie3 = Movie.builder().build();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        Mockito.when(moviesRepositoryMock.findAll()).thenReturn(movies);
        List<Movie> result = moviesAdapterUnderTest.getAllMovies();
        Assert.assertEquals(movies.size(), result.size());
    }

    @Test
    public void saveMovie() {
        Movie movie1 = Movie.builder().id(1L).build();
        Mockito.when(moviesRepositoryMock.save(movie1)).thenReturn(movie1);
        Movie result = moviesAdapterUnderTest.saveMovie(movie1);
        Assert.assertEquals(movie1.getId(), result.getId());
    }

    @Test
    public void getMovieById() {
        Movie movie1 = Movie.builder().id(1L).build();
        Mockito.when(moviesRepositoryMock.getOne(movie1.getId())).thenReturn(movie1);
        Movie result = moviesAdapterUnderTest.getMovieById(movie1.getId());
        Assert.assertEquals(movie1.getId(), result.getId());
    }

    @Test
    public void deleteMovieById() {
        Movie movie1 = Movie.builder().id(1L).build();
        moviesAdapterUnderTest.deleteMovieById(movie1.getId());
        Mockito.verify(moviesRepositoryMock, Mockito.times(1)).deleteById(movie1.getId());
    }

}
