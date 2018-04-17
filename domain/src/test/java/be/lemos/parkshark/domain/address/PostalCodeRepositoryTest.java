package be.lemos.parkshark.domain.address;

import be.lemos.parkshark.utilities.Config;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = "be.lemos.parkshark.domain")
@SpringBootTest(classes = {PostalCodeRepository.class, Config.class})
public class PostalCodeRepositoryTest {

    @Autowired
    private PostalCodeRepository postalCodeRepository;

    @Test
    @Transactional
    public void savePostalCode() {
        PostalCode pc = new PostalCode(1050, "Ixelles");

        postalCodeRepository.savePostalCode(pc);

        Assertions.assertThat(postalCodeRepository.findPostalCode(1050)).isEqualTo(pc);
    }
}