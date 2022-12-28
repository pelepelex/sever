package peleweb.co.za.sever.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import peleweb.co.za.sever.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long > {
    Server findByIpAddress(String ipAddress);
}
