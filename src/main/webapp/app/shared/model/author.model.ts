import { Moment } from 'moment';
import { IBook } from 'app/shared/model/book.model';

export interface IAuthor {
    id?: string;
    name?: string;
    birthDate?: Moment;
    books?: IBook[];
}

export class Author implements IAuthor {
    constructor(public id?: string, public name?: string, public birthDate?: Moment, public books?: IBook[]) {}
}
