package org.example;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatronManagement {
    private List<Patrons> patronsList = new ArrayList();

    private static final Logger logger = LoggerFactory.getLogger(LendingProcess.class);

    public void addNewPatron(Patrons patrons) {
        this.patronsList.add(patrons);
        logger.info("The patron {} has been successfully added in PatronManagement", patrons);

    }

    public void updateNameOfPatrons(long memberId, String newname) {
        for(Patrons patron : this.patronsList) {
            if (patron.getMember_id() == memberId) {
                patron.setName(newname);
                return;
            }
        }

        throw new IllegalArgumentException("Patron with memberId " + memberId + "Not found");
    }

    public void updateMobileNumber(long memberId, long newMobileNumber) {
        for(Patrons patron : this.patronsList) {
            if (patron.getMember_id() == memberId) {
                patron.setMobileNumber(newMobileNumber);
                return;
            }
        }

        throw new IllegalArgumentException("Patron with memberId " + memberId + "Not found");
    }

    public void updateEmail(long memberId, String newEmail) {
        for(Patrons patron : this.patronsList) {
            if (patron.getMember_id() == memberId) {
                patron.setEmailId(newEmail);
                return;
            }
        }

        throw new IllegalArgumentException("Patron with memberId " + memberId + "Not found");
    }
}
