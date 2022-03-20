import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Incidencia } from '../model/incidencia';

@Injectable({
  providedIn: 'root'
})
export class IncidenciaService {

  constructor(private http: HttpClient) { }

  listaIncidencias(): Observable<Incidencia[]> {
    // const url = '/api/incidencia';
    const url = 'assets/incidencias.json';
    return this.http.get<Incidencia[]>(url);
  }
}
