import { BaseEntity } from './../../shared';

export class Project implements BaseEntity {
    constructor(
        public id?: string,
        public name?: string,
    ) {
    }
}
