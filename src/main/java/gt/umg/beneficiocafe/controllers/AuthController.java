package gt.umg.beneficiocafe.controllers;

import gt.umg.beneficiocafe.payload.request.LoginRequest;
import gt.umg.beneficiocafe.payload.request.SignupRequest;
import gt.umg.beneficiocafe.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/jwt")
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        return authService.authenticateUserSvc(loginRequest);
    }

    @PostMapping("/registrarse")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        return authService.registerUserSvc(signUpRequest);
    }
}
