import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IAuthor } from 'app/shared/model/author.model';

@Component({
    selector: 'jhi-author-detail',
    templateUrl: './author-detail.component.html'
})
export class AuthorDetailComponent implements OnInit {
    author: IAuthor;
    checkbox;
    name_async;

    constructor(protected activatedRoute: ActivatedRoute) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ author }) => {
            this.author = author;
        });
    }

    previousState() {
        window.history.back();
    }

    print(message: string) {
        console.log(this.author.name);
    }

    async updateModel() {
        let k = 0;
        for (let i = 0; i < 100000; i++) {
            k = k + 1;
            this.print(k.toString());
        }
        this.name_async = this.author.name + k;
    }
}
