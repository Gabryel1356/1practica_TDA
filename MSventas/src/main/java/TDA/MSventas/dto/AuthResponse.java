package TDA.MSventas.dto;

import java.io.Serializable;
 
public class AuthResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String importe;

    public AuthResponse(String importe) {
        this.importe = importe;    
    }

    // public AuthResponse(String token, String userName, String accessTokenExpiration) {
    //     this.token = token;
    //     this.userName = userName;
    //     this.accessTokenExpiration = accessTokenExpiration;
    // }

    public String getUserName() {
        return importe;
    }

}
