package com.redkite;


import com.redkite.ds.DataSources;
import com.redkite.gen.model.tables.pojos.Author;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.util.List;

import static com.redkite.gen.model.Tables.AUTHOR;

public class Main {
    public static void main(String[] args) {
        DSLContext create = DSL.using(DataSources.MARIADB.getDs(), SQLDialect.MARIADB);
        List<Author> a = create.select().from(AUTHOR).fetchInto(Author.class);
        System.out.println(a);
    }
}
