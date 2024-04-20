package ma.bouchama.hospital2;

import ma.bouchama.hospital2.entities.Patient;
import ma.bouchama.hospital2.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class Hospital2Application implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(Hospital2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Hajar",new Date(),false,20));
        patientRepository.save(new Patient(null,"Houria",new Date(),true,50));
        patientRepository.save(new Patient(null,"Khadija",new Date(),false,17));
        patientRepository.save(new Patient(null,"Fouad",new Date(),false,25));


    }
    @Bean
    PasswordEncoder  passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
