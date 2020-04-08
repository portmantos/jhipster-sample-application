package com.mycompany.portmantos.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.portmantos.web.rest.TestUtil;

public class DepartmentTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Department.class);
        Department department1 = new Department();
        department1.setId(1L);
        Department department2 = new Department();
        department2.setId(department1.getId());
        assertThat(department1).isEqualTo(department2);
        department2.setId(2L);
        assertThat(department1).isNotEqualTo(department2);
        department1.setId(null);
        assertThat(department1).isNotEqualTo(department2);
    }
}
