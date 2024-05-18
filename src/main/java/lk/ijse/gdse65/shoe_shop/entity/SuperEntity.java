package lk.ijse.gdse65.shoe_shop.entity;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.Collection;

public interface SuperEntity extends Serializable {
    Collection<? extends GrantedAuthority> getAuthorities();

    String getUsername();

    boolean isAccountNonExpired();

    boolean isAccountNonLocked();

    boolean isCredentialsNonExpired();

    boolean isEnabled();
}
