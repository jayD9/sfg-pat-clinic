package jd.springframwork.sfgpetclinic.bootstrap;

import jd.springframwork.sfgpetclinic.model.Owner;
import jd.springframwork.sfgpetclinic.model.Vet;
import jd.springframwork.sfgpetclinic.services.OwnerService;
import jd.springframwork.sfgpetclinic.services.VetService;
import jd.springframwork.sfgpetclinic.services.map.OwnerServiceMap;
import jd.springframwork.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * author JD
 * created 2/23/21 3:01 PM
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Nikhil");
        owner1.setLastName("Ashodariya");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Smit");
        owner1.setLastName("Hapani");

        ownerService.save(owner2);

        System.out.println("Owner loaded successfully.....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Vrushank");
        vet1.setLastName("Shah");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Jay");
        vet1.setLastName("Darji");

        vetService.save(vet2);

        System.out.println("Vet loaded successfully.....");
    }
}
