import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { TestModule } from 'app/entities/test/test.module';

@NgModule({
    imports: [
        RouterModule.forChild([
            {
                path: 'author',
                loadChildren: './author/author.module#TestAppAuthorModule'
            },
            {
                path: 'book',
                loadChildren: './book/book.module#TestAppBookModule'
            }
            /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
        ]),
        TestModule
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class TestAppEntityModule {}
