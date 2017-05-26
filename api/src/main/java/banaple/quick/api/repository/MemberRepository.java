package banaple.quick.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import banaple.quick.api.domain.Member;


@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {}
