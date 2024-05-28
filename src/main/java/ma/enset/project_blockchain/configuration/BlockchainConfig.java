package ma.enset.project_blockchain.configuration;


import ma.enset.project_blockchain.entity.Blockchain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BlockchainConfig {

    @Bean
    @Scope("singleton")
    public Blockchain blockchain() {
        return new Blockchain(2);
    }
}