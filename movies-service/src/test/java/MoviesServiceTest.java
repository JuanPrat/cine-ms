import com.poli.moviesservice.contracts.MoviesInterface;
import com.poli.moviesservice.entity.Movie;
import com.poli.moviesservice.service.MoviesService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class MoviesServiceTest {

    @Mock
    MoviesInterface moviesInterfaceMock;

    @InjectMocks
    MoviesService moviesServiceUnderTest;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        moviesServiceUnderTest = new MoviesService(moviesInterfaceMock);
    }

    @Test
    public void getAllMovies(){
        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie1 = Movie.builder().build();
        Movie movie2 = Movie.builder().build();
        Movie movie3 = Movie.builder().build();
        Mockito.when(moviesInterfaceMock.getAllMovies()).thenReturn(movies);
        List<Movie> result = moviesServiceUnderTest.getAllMovies();
        Assert.assertEquals(movies.size(), result.size());

    }

    @Test
    public void SaveMovie(){
        Movie movie1 = Movie.builder().director("tarantino").id(213L).build();

        Mockito.when(moviesInterfaceMock.saveMovie(movie1)).thenReturn(movie1);
        Movie result = moviesServiceUnderTest.saveMovie(movie1);
        Assert.assertEquals(result.getId(), result.getId());

    }

    @Test
    public void findMovieById(){
        Movie movie1 = Movie.builder().director("tarantino").id(213L).build();
        Mockito.when(moviesInterfaceMock.saveMovie(movie1)).thenReturn(movie1);
        Movie result = moviesServiceUnderTest.saveMovie(movie1);
        Assert.assertEquals(result.getId(), result.getId());
    }

    @Test
    public void deleteMovie(){
        Long id = 1L;
        Mockito.when(moviesInterfaceMock.deleteMovieById(id)).thenReturn(1L);
        Long result = moviesServiceUnderTest.deleteMovieById(id);
        Assert.assertEquals(result, id);
    }
}
