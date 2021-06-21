package controllers;

import com.project.userservice.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @PostMapping(Constants.POST_REQUEST)
    public void postRequest(@RequestBody String msg) {
        log.info("Получено " + msg);
        //TODO Реализация метода
    }

}
