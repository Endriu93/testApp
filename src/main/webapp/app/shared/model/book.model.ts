import { Moment } from 'moment';

export interface IBook {
    id?: string;
    title?: string;
    description?: string;
    publicationDate?: Moment;
    price?: number;
    authorName?: string;
    authorId?: string;
}

export class Book implements IBook {
    constructor(
        public id?: string,
        public title?: string,
        public description?: string,
        public publicationDate?: Moment,
        public price?: number,
        public authorName?: string,
        public authorId?: string
    ) {}
}
