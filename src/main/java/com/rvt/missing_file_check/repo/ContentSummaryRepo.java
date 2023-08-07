package com.rvt.missing_file_check.repo;

import com.rvt.missing_file_check.model.ContentSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentSummaryRepo extends JpaRepository<ContentSummary, Integer> {
    @Query(value = "SELECT c FROM ContentSummary c WHERE c.isActive = true GROUP BY c.contentId")
    //@Query(value = "SELECT * FROM content_summary c WHERE c.is_active=1 GROUP BY c.content_id",nativeQuery = true)

    List<ContentSummary> findAllActiveContent();
}
