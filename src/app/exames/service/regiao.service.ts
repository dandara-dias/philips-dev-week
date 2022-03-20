import { Injectable } from '@angular/core';
import { Regiao } from '../model/regiao';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegiaoService {

  constructor(private http: HttpClient) { }

  listRegioes(): Observable<Regiao[]> {
    // const url = '/api/regiao';
    const url = 'assets/regioes.json';
    return this.http.get<Regiao[]>(url);
  }
}
