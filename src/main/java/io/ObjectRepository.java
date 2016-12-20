package io;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.N1qlSecondaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

@ViewIndexed(designDoc = "p")
@N1qlPrimaryIndexed
@N1qlSecondaryIndexed(indexName = "p")
public interface ObjectRepository extends CouchbaseRepository<Data, String> {

}
