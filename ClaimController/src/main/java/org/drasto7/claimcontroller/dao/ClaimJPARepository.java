package org.drasto7.claimcontroller.dao;

import org.drasto7.claimcontroller.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimJPARepository extends JpaRepository<Claim, String>{

}
