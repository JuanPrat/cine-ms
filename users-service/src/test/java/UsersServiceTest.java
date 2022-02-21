import com.poli.usersservice.client.BookingClient;
import com.poli.usersservice.contracts.UsersContract;
import com.poli.usersservice.entity.User;
import com.poli.usersservice.service.UsersService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.*;

import static org.mockito.ArgumentMatchers.any;

public class UsersServiceTest {

    @Mock
    public BookingClient bookingClient;

    @Mock
    public UsersContract usersContract;

    @InjectMocks
    public UsersService usersServiceUnderTest;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        usersServiceUnderTest = new UsersService(bookingClient, usersContract);
    }

    @Test
    public void findAllTest() {
        User user = new User();
        User user2 = new User();
        User user3 = new User();
        List<User> listUsers = new ArrayList<>();
        listUsers.add(user);
        listUsers.add(user2);
        listUsers.add(user3);

        Mockito.when(usersContract.findAll()).thenReturn(listUsers);
        List<User> result = usersServiceUnderTest.findAll();
        Assert.assertEquals(result.size(), 3);
    }

    @Test
    public void saveUserTest()
    {
        User user1 = new User(1L, "juan", "garcia");
        Mockito.when(usersContract.saveUser(user1)).thenReturn(user1);
        User resultado = usersServiceUnderTest.saveUser(user1);
        Assert.assertEquals(user1.getId(), resultado.getId());
    }

    @Test
    public void deleteUserDoesNotDeleteTest() {
        ArrayList<Long> idsPeliculas = new ArrayList<>();
        idsPeliculas.add(1L);
        idsPeliculas.add(2L);
        ResponseEntity responseEntity = ResponseEntity.accepted().body(idsPeliculas);
        Mockito.when(bookingClient.getBookingByUserId(1214L)).thenReturn(responseEntity);
        Object resultado = usersServiceUnderTest.deleteUser(1214L);
        Assert.assertEquals(resultado, null);
    }

    @Test
    public void deleteUserTest() {
        ArrayList<Long> idsPeliculas = new ArrayList<>();
        ResponseEntity responseEntity = ResponseEntity.accepted().body(idsPeliculas);
        Mockito.when(bookingClient.getBookingByUserId(1214L)).thenReturn(responseEntity);
        Mockito.when(usersContract.deleteUser(any())).thenReturn(1214L);
        Object resultado = usersServiceUnderTest.deleteUser(1214L);
        Assert.assertEquals(resultado, 1214L);
    }
}
